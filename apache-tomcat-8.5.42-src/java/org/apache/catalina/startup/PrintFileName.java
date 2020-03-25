package org.apache.catalina.startup;

import java.io.File;

public class PrintFileName {

    public static void printFile(File file, int line) {
        // 第一步判断传递进来的file是否存在，不存在则return，递归的回归入口
        if(file == null || !file.exists()) {
            return ;
        }

        // 如果是文件夹，则遍历文件夹下的所有文件
        if(file.isDirectory()) {
            for (File f : file.listFiles()) {
                if(f.isHidden()){
                    continue;
                }
                // 再次调用自身，层级加1，为改目录下的(文件/文件夹)了
                printFile(f, line+1 );
            }
        }

        //如果为文件，则输出文件绝对路径，带上文件层级
        if(file.isFile()) {
            System.out.println( file.getAbsolutePath() + "---" + line );
        }
    }
}
