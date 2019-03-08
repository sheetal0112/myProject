package demo.domain

import spock.lang.Specification
import spock.lang.Unroll

class OrderSpec extends Specification {
    def "Constructor"(){
        setup:
        Order order
        when:
        order=new Order(2,"mobile",20000)
        then:
        order.getQuantity()==2
        order.getItemName()=="mobile"
        order.getPrice()==20000
    }
    @Unroll
    def "SetQuantity"() {
        setup:
        Order order=new Order()
        when:
        order.setQuantity(set)
        then:
        order.getQuantity()==get
        where:
        set|get
        50|50
        0|0
    }
    @Unroll
    def "SetItemName"() {
        setup:
        Order order=new Order()
        when:
        order.setItemName(set)
        then:
        order.getItemName()==get
        where:
        set|get
        "laptop"|"laptop"
        "mobile"|"mobile"
    }
    @Unroll
    def "SetPrice"() {
        setup:
        Order order=new Order();
        when:
        order.setPrice(set)
        then:
        order.getPrice()==get
        where:
        set|get
        10000|10000
        0|0
    }
    @Unroll
    def "SetPriceWithTex"() {
        setup:
        Order order=new Order()
        when:
        order.setPriceWithTex(set)
        then:
        order.getPriceWithTex()==get
        where:
        set|get
        5000.5|5000.5
        0|0
    }
}
