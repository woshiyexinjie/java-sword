package com.helloxin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by yebanxian on 2019/12/4.
 */
public class JocksonTest {

    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        Person person = new Person();
//        person.setName("Tom");
//        person.setAge(40);
//        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
//        Person deserializedPerson = mapper.readValue(jsonString, Person.class);
//        System.out.println(deserializedPerson);

//        ObjectMapper mapper = new ObjectMapper();
//        ObjectNode personNode = mapper.createObjectNode();
//        personNode.put("name","Tom");
//        personNode.put("age",40);
//        ObjectNode addressNode = mapper.createObjectNode();
//        addressNode.put("zip","000000");
//        addressNode.put("street","Road NanJing");
//        personNode.set("address",addressNode);
//        JsonNode searchNode = personNode.path("street ");
//        ((ObjectNode) personNode).remove("address");
//        JsonNode rootNode = mapper.readTree(personNode.toString());
//        Person person = mapper.treeToValue(personNode, Person.class);
//        JsonNode node = mapper.valueToTree(person);

        ObjectMapper objectMapper = new ObjectMapper();
        //json转pojo
        Person person = objectMapper.readValue("{\"name\":\"Bob\", \"age\":13}", Person.class);
        System.out.println(person.name + person.age);

        String jsonString = objectMapper.writeValueAsString(person);
        System.out.println("pojo转json的结果是 -----"+ jsonString);

    }
}
