package demo.service

import demo.domain.Order
import spock.lang.Specification

class EmailServiceTest extends Specification {
    def "SendEmail"() {
    setup:
    EmailService emailService=new EmailService();
        when:
        Order order=Mock(Order)
        emailService.sendEmail(order)
        then:
        thrown(RuntimeException)
    }

    def "Send Email with a String "() {
    setup:
    EmailService emailService=EmailService.getInstance();
        when:
        Order order=Mock(Order)
        Boolean result=emailService.sendEmail(order,"XYZ")
        then:
        result==true
    }
}
