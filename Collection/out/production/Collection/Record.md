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
 boolean b = collection.containsAll(obj);//根据参数指定元素，元素对应集合里的数据返回true，否则false
 System.out.println(b);