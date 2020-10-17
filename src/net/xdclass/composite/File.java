package net.xdclass.composite;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description 这个类是没有节点，不用存储其他子类数组，所以是叶子节点
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class File extends Root{

    public File(String name){
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<depth;i++){
            sb.append("-");
        }
        //打印横线和当前文件名
        System.out.println(sb.toString()+this.getName());

    }
}
