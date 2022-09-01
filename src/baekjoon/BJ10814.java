package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] inputs;
        List<Person> persons = new ArrayList<>();

        for(int i = 0; i < num; i++) {
            inputs = br.readLine().split(" ");
            persons.add(new Person(i, Integer.parseInt(inputs[0]), inputs[1]));
        }

        Collections.sort(persons, Person::compareTo);

        StringBuilder sb = new StringBuilder();

        for(Person p : persons) {
            sb.append(p.getAge()).append(" ").append(p.getName()).append("\n");
        }

        System.out.println(sb);
    }
}

class Person implements Comparable<Person> {
    private int id;
    private int age;
    private String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person p) {
        if(this.age == p.age) {
            return this.id - p.id;
        } else {
            return this.age - p.age;
        }
    }
}

// 반영하지 말아주세요? or 반영을 roll back