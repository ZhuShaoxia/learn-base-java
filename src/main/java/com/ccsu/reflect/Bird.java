package com.ccsu.reflect;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/3/20
 * @Time: 12:46
 * Description:
 */
public class Bird implements Fly {
    private String name;
    private String birth;

    private Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }

    public Bird(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String fly(String animal) {
        System.out.println("动物：" + animal + "  flying");
        return animal;
    }

    public void jump(){
        return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
