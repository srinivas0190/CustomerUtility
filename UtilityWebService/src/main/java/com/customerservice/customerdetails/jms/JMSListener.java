package com.customerservice.customerdetails.jms;

import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

import com.customerservice.customerdetails.service.MessageService;

/**
 * JMS listener to listen to the service messages in the activeMQ
 * @author Srinivas Kondapaneni
 *
 */
@Component("JMSListener")
public class JMSListener implements SessionAwareMessageListener<TextMessage> {

	@Override
	public void onMessage(TextMessage message, Session session) throws JMSException {
		// TODO Auto-generated method stub
		if (message instanceof TextMessage) {
			String msg;
	
				msg = ((TextMessage) message).getText();
			
			//String scid= msg.toString();
			System.out.println("OnMessage Received  :" + msg);
			    
			String [] msgAry = msg.split(" ");		
				
					int c_id=Integer.parseInt(msgAry[0]);
					int serv_id=Integer.parseInt(msgAry[1]);
					
					MessageService messService = new MessageService();
					int update = messService.setCustomerService(c_id, serv_id);
					
					ActiveMQTextMessage textMessage = new ActiveMQTextMessage();
					if (update > 0 )
				    textMessage.setText("ACK");
					else 
					textMessage.setText("Failed to insert");
				    
				    MessageProducer producer = session.createProducer(message.getJMSReplyTo());
				    producer.send(textMessage);
			}}}
