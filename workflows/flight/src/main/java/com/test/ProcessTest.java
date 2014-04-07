package com.test;


import java.util.HashMap;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.jbpm.process.workitem.email.EmailWorkItemHandler;


/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

	public static final void main(String[] args) throws Exception {
		// load up the knowledge base
		KnowledgeBase kbase = readKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("customerType","");
		params.put("income", 100000f);
		 
		
		ksession.startProcess("com.sample.bpmn", params);
		
		
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("flightdes.bpmn"), ResourceType.BPMN2);
		return kbuilder.newKnowledgeBase();
	}
	
}