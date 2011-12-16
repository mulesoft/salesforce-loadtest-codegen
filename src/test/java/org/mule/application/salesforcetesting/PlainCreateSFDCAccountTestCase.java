/*
 * Generated by the Mule project wizard. http://mule.mulesoft.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.application.salesforcetesting;

import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.FunctionalTestCase;
import org.mule.transport.NullPayload;

import java.util.HashMap;
import java.util.Random;

public class PlainCreateSFDCAccountTestCase extends FunctionalTestCase
{
    protected String getConfigResources()
    {
        //TODO You'll need to edit this file to make the test applicable to your module
        return "src/test/resources/mule-simple-sfdcaccount.xml";
    }

    public void testSalesForceToIntacct() throws Exception
    {
    	
        MuleClient client = new MuleClient(muleContext);
        MuleMessage mm = client.send("vm://testcreateaccount.in", null, null);
        
        System.out.println("\n\nTest Results:\n" + mm);
        System.out.println("\n\nResult Exceptions:\n" + mm.getExceptionPayload());
        System.out.println("\n\nResult Payload:\n" + mm.getPayloadAsString());
        
        // = client.request("vm://bridge2", 1);
        /*
        assertNotNull(result);
        assertNull(result.getExceptionPayload());
        assertFalse(result.getPayload() instanceof NullPayload);

        //TODO Assert the correct data has been received
        assertEquals("some data Received", result.getPayloadAsString());
        */
    }
}
