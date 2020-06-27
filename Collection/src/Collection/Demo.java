package Collection;


import jdk.nashorn.internal.codegen.types.BitwiseType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {

        Collection<Object> collection = new ArrayList<>();
        collection.add(399);
        collection.add("Bear");
//        int size = collection.size();//判断集合长度
//        System.out.println(size);
//
//
//
//        boolean empty = collection.isEmpty();//判断集合元素是否为空，空则true，否则为false
//        System.out.println(empty);
//
//        boolean contains = collection.contains(233);//判断是否包含指定元素，包含为true，否则false
//        System.out.println(contains);
//
//        Iterator<Object> iterator = collection.iterator();// 返回一个迭代器类
//        while(iterator.hasNext()) { //使用迭代器遍历集合数据
//            Object next = iterator.next();
//            System.out.println(next);
//        }
//
//        System.out.println("----------------------------");
//
//        Object[] objects = collection.toArray();//转换为一个数组
//        System.out.println(objects[0]);//获取第0号索引值
//        for (Object object : objects) {//遍历数组
//            System.out.println(object);
//        }
//        System.out.println(objects.length); //返回集合中的长度
//
//        System.out.println("----------------------------");
//
//        Object[] object = {1,2,3,4,5};
//        Object[] toArray = collection.toArray(new Object[]{233,"bear"});//利用参数里的对象集合对应集合的长度，根据参数指定返回长度，长度超出则打印null
//        for (Object o : toArray) {
//            System.out.println(o);
//        }
//
//        System.out.println("----------------------------");
//
//        System.out.println(collection.add(123));//往集合里添加数据，对象类型
//        System.out.println(collection.add("123"));
//        System.out.println(collection.add('F'));
//        System.out.println(collection);//打印添加的数据
//
//        System.out.println("------------------------");
//
//        boolean remove = collection.remove(233);//移除指定的元素
//        System.out.println(remove);
//
//
        Collection<Object> obj = new ArrayList<>();
        obj.add(399);
        boolean b = collection.containsAll(obj);//根据参数指定元素，元素对应集合里的数据返回true，否则false
        System.out.println(b);
//
//
//        Collection<Object> list = new ArrayList<>();
//        list.add(222);
//        boolean addAll = collection.addAll(list);//根据集合参数添加多个值
//        System.out.println(addAll);
//        System.out.println(collection);
//
//
//        System.out.println("-------------------------------");
//
//        //removeAll:根据集合参数添加多个数据进行批量删除
//        Collection<Object> rem = new ArrayList<>();
//        rem.add(233);
//        rem.add("Bear");
//        boolean removeAll = collection.removeAll(rem);
//        System.out.println(removeAll);
//
//
//        Collection<Person> coo = new ArrayList<Person>();//创建一个新集合，泛型为Person对象
//        coo.add(new Person(18));
//        coo.add(new Person(19));
//        coo.removeIf(new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {  //重写Predicate接口的test方法
//                return person.getAge() >10; //筛选对象Person对象年龄大于20的数据
//            }
//        });
//        System.out.println(coo);//打印结果
//
//        coo.removeIf(
//          person -> person.getAge() >20 //lambda简便格式
//        );
//        System.out.println(coo);
//
//
//        System.out.println("------------------------------");


//        Collection<Object> co = new ArrayList<>();
//        co.add(399);
//        co.add("Bear");
//        collection.retainAll(co);//取得两个集合的交集,输出打印相同的数值
//        System.out.println(collection);

          //clear:清除集合所有数据
//        collection.clear();
//        System.out.println(collection);//清除过后则获取不到集合里的值

//        Collection<Object> objects = new ArrayList<>();
//        objects.add(399);
//        objects.add("Bear");
//
//        boolean equals = collection.equals(objects);//比较两个对象是否相同，返回值为布尔
//        System.out.println(equals);
//
//        //hashCode:返回这个集合的哈希值
//        int Code = collection.hashCode();
//        System.out.println(Code);
//
//        //spliterator:用于分割和遍历集合
//        Spliterator<Object> spliterator = co.spliterator();
//        System.out.println(spliterator.estimateSize());//获取集合的长度
//        spliterator.forEachRemaining(System.out::println);//遍历集合的数据
//
//        System.out.println("-------------------------");
//
//        //stream：返回一个stream流对象，可根据其方法操作集合
//        Stream<Object> stream = collection.stream();
//        stream.forEach(System.out::println);//使用forEach遍历集合元素
//
//        //parallelStream：和stream方法一样，parallelStream支持顺序流，线程不安全
//        Stream<Object> parallelStream = collection.parallelStream();
//        parallelStream.forEach(System.out :: println);
    }
}
