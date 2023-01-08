package com.example.algorithm.basicALG.list;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * 基础类型操作
 * API：
 * BasicList
 *           basicClassToList    解决Arrays.asList转换基本类型数组返回的为List视图，返回的是内部类，并未包含add(),remove()操作
 *           subClearList        清除队列指定索引范围
 *           subList             取索引范围List
 *
 *
 * 扩展知识：
 *      泛型的使用规范：
 *                  1、不能实例化泛型类
 *                  2、静态变量或方法不能引用泛型类型变量，但是静态泛型方法是可以的
 *                  3、基本类型无法作为泛型类型
 *                  4、无法使用 instanceof 关键字或 == 判断泛型类的类型
 *                  5、泛型类的原生类型与所传递的泛型无关，无论传递什么类型，原生类是一样的
 *                  6、泛型数组可以声明但无法实例化
 *                  7、泛型类不能继承 Exception 或者 Throwable
 *                  8、不能捕获泛型类型限定的异常但可以将泛型限定的异常抛出
 */
public class BasicList {
    /**
     * Int数组转换为List数组,原本Arrays.asList不支持基础类型
     * 仅支持 jdk1.8 使用，低于1.8版本，先将基础数组转换为包装类即可解决。
     *
     * @param a-所需传入得数组
     * @return List<Integer>-list队列
     */
    @SuppressWarnings("varargs")
    public static List<Integer> basicClassToList(int [] a) {
        Objects.requireNonNull(a);
        List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());
        return collect;
    }

    /**
     *
     * @param a-所需清除索引范围的队列
     * @param fromIndex-清除起始位
     * @param toIndex-清除结束位
     * @return null
     * @apiNote
     *  此方法调用subList.clear用来清除原有表结构索引区间
     */
    @SuppressWarnings("varargs")
    public static void subClearList(List<?> a, int fromIndex, int toIndex) {
        Objects.requireNonNull(a);
        if (fromIndex > toIndex) {
            fromIndex = 0;
            toIndex = 0;
        }
        a.subList(fromIndex, toIndex).clear();
    }
    /**
     *
     * @param collect-原有队列
     * @param fromIndex-取值开始位
     * @param toIndex-取值结束位
     * @return List<?>-区间队列
     * @apiNote
     *  此方法使用stream流结合skip与limit，切片取值，具体性能优化可参考skip注释进行修改，此方法仅方便开发。
     */
    @SuppressWarnings("varargs")
    public static List<?> subList(List<?> collect, int fromIndex, int toIndex) {
        Objects.requireNonNull(collect);
        if (fromIndex > toIndex) {
            fromIndex = 0;
            toIndex = 0;
        }
        collect.stream().skip(fromIndex).limit(toIndex).collect(Collectors.toList());
        return collect;
    }
    /**
     * jdk 1.8 ArrayList 类
     * @param <E>
     */
    private static class ArrayList<E> extends AbstractList<E>
            implements RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = -2764017481108945198L;
        private final E[] a;

        ArrayList(E[] array) {
            a = Objects.requireNonNull(array);
        }

        @Override
        public int size() {
            return a.length;
        }

        @Override
        public Object[] toArray() {
            return a.clone();
        }

        @Override
        @SuppressWarnings("unchecked")
        public <T> T[] toArray(T[] a) {
            int size = size();
            if (a.length < size)
                return Arrays.copyOf(this.a, size,
                        (Class<? extends T[]>) a.getClass());
            System.arraycopy(this.a, 0, a, 0, size);
            if (a.length > size)
                a[size] = null;
            return a;
        }

        @Override
        public E get(int index) {
            return a[index];
        }

        @Override
        public E set(int index, E element) {
            E oldValue = a[index];
            a[index] = element;
            return oldValue;
        }

        @Override
        public int indexOf(Object o) {
            E[] a = this.a;
            if (o == null) {
                for (int i = 0; i < a.length; i++)
                    if (a[i] == null)
                        return i;
            } else {
                for (int i = 0; i < a.length; i++)
                    if (o.equals(a[i]))
                        return i;
            }
            return -1;
        }

        @Override
        public boolean contains(Object o) {
            return indexOf(o) != -1;
        }

        @Override
        public Spliterator<E> spliterator() {
            return Spliterators.spliterator(a, Spliterator.ORDERED);
        }

        @Override
        public void forEach(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            for (E e : a) {
                action.accept(e);
            }
        }

        @Override
        public void replaceAll(UnaryOperator<E> operator) {
            Objects.requireNonNull(operator);
            E[] a = this.a;
            for (int i = 0; i < a.length; i++) {
                a[i] = operator.apply(a[i]);
            }
        }

        @Override
        public void sort(Comparator<? super E> c) {
            Arrays.sort(a, c);
        }
    }
}
