package com.test;


import java.util.HashMap;
import java.util.Map;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;


/**
 * This is a sample file to launch a process.
 */
public class ProcessTest {

	public static final void main(String[] args) throws Exception {
		// load up the knowledge base
		KnowledgeBase kbase = readKnowledgeBase();
		StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("IsApproved",2);
		ksession.startProcess("com.sample.bpmn", params);
		
		// start a new process instance
		//ksession.startProcess("com.sample.bpmn");
	}

	private static KnowledgeBase readKnowledgeBase() throws Exception {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add(ResourceFactory.newClassPathResource("new.bpmn"), ResourceType.BPMN2);
		return kbuilder.newKnowledgeBase();
	}
	
}