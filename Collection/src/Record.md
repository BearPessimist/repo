boolean contains = collection.contains("Bear");//判断是否包含指定元素，包含为true，否则false
System.out.println(contains);//打印为true

Iterator<Object> iterator = collection.iterator();// 返回一个迭代器接口
while(iterator.hasNext()) { //使用迭代器遍历集合数据
    Object next = iterator.next();
    System.out.println(next);
}

Object[] objects = collection.toArray();//转换为一个数组
System.out.println(objects[0]);//获取第0号索引值
for (Object object : objects) {//使用增强for循环遍历数组
    System.out.println(object);
}

 Object[] toArray = collection.toArray(new Object[]{233,"bear"});//利用参数里的对象集合对应集合的长度，根据参数指定返回长度，长度超出则打印null
 for (Object o : toArray) {
     System.out.println(o);
 }
 
System.out.println(collection.add(123));//往集合里添加数据，对象类型
System.out.println(collection.add("123"));
System.out.println(collection.add('F'));

boolean remove = collection.remove(399);//移除指定的元素
System.out.println(remove);//打印为布尔值

 Collection<Object> obj = new ArrayList<>();
 obj.add(233);
 boolean b = collection.containsAll(obj);//根据其它集合参数对应初始集合里的数据，对应则返回true，否则false
 System.out.println(b);
 
 Collection<Object> list = new ArrayList<>();//创建另一个集合
 list.add(222);
 boolean addAll = collection.addAll(list);//根据集合参数添加多个值
 System.out.println(addAll);//返回为true
 System.out.println(collection);//打印集合内容，
 
 Collection<Object> rem = new ArrayList<>();
 rem.add(233);//添加需要移除的元素
 rem.add("Bear");//添加需要移除的元素
 boolean removeAll = collection.removeAll(rem); //removeAll:根据集合参数添加多个数据进行批量删除
 System.out.println(removeAll);
 //lambda简便格式
 coo.removeIf(
   person -> person.getAge() >20 
 );
 System.out.println(coo);//打印过滤
 
 Collection<Object> co = new ArrayList<>();
 co.add(399);
 co.add("Bear");
 collection.retainAll(co); //取得两个集合的交集,输出打印相同的数值
 System.out.println(collection);
 
 //clear:清除集合所有数据
 collection.clear();
 System.out.println(collection);//清除过后则获取不到集合里的值
 
 Collection<Object> objects = new ArrayList<>();
 objects.add(399); //比较的内容
 objects.add("Bear"); //比较的内容
 boolean equals = collection.equals(objects);//比较两个对象是否相同，返回值为布尔
 System.out.println(equals);
 
 //hashCode:返回这个集合的哈希值
 int Code = collection.hashCode();
 System.out.println(Code);
 
 //spliterator:用于分割和遍历集合
 Spliterator<Object> spliterator = co.spliterator();
 System.out.println(spliterator.estimateSize());//获取集合的长度
 spliterator.forEachRemaining(System.out::println);//遍历集合的数据
 
 //stream：返回一个stream流对象，可根据其方法操作集合
 Stream<Object> stream = collection.stream();
 stream.forEach(System.out::println);//使用forEach遍历集合元素
 
 //parallelStream：和stream方法一样，parallelStream支持顺序流，线程不安全
 Stream<Object> parallelStream = collection.parallelStream();
 parallelStream.forEach(System.out :: println);
 
 