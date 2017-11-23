package com.tutorial.reflect.level1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimmy on 2017/11/21.
 * 集合泛型的本质:只在编译阶段有效,绕过编译到了运行期就无效了
 */
public class ReflectGenericTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<String>();
        list.add("java");
        //list.add(1);
        System.out.println(list.size()); //1

        Class aClass = list.getClass();
        Method method = aClass.getDeclaredMethod("add",Object.class);
        method.invoke(list,12);
        System.out.println(list.size()); //2
    }
}
