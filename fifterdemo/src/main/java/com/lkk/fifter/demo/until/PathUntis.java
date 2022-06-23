package com.lkk.fifter.demo.until;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName PathUntis
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/15/11:19
 * @Version 1.0
 **/
public class PathUntis {

   public static List<String> addList =new ArrayList<>();
    static {
        addList.add("/test/*");
    }

    public static List<String> excuList =new ArrayList<>();
    static {
        excuList.add("/resources/*");
    }
}
