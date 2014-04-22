package com.canoo.webtest.groovy

import org.junit.Test
import junit.framework.TestCase
import com.canoo.webtest.groovy.WebTestBuilder
import groovy.util.GroovyTestCase
/**
 * @author Marc Guillemot
 */
public class WebTestBuilderTestIt implements Runnable
{
	void run()
	{
		def ant = new WebTestBuilder()
		ant.antProject.addTaskDefinition("groovy", GroovyStep)
		ant.groovy {
			//throw new NullPointerException("hello")
			println step
			blabla()
		}
		
	}
	
	
	def blabla()
	{
		println "in blabla"
	}
}