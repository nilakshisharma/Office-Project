/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.backofficetools.components.savewarrantydetails;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class savewarrantydetails__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
out.write("<head>\r\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n</head>\r\n   <div class=\"save__container\">\r\n    <div class=\"main\">\r\n        <div class=\"main__head\">\r\n            <h1>Warranty Details</h1>\r\n            <div class=\"line\"></div>\r\n        </div>\r\n       <form class=\"main__form\">\r\n         <div class=\"form__IDs\">\r\n            <div class=\"form__IDs--model\">\r\n                <input type=\"text\" placeholder=\"ModelID\" id=\"modelid\"/>\r\n                <label for=\"modelid\">MODEL ID*</label>\r\n                <span class=\"error\"></span>\r\n            </div>\r\n            <div class=\"form__IDs--product\">\r\n                <input type=\"text\" placeholder=\"ProductID\" id=\"productid\"/>\r\n                <label for=\"productid\">PRODUCT ID*</label>\r\n                <span class=\"error\"></span>\r\n            </div>\r\n         </div>\r\n\r\n         <div class=\"form__dates\">\r\n            <div class=\"form__dates-start\">\r\n                <input type=\"date\" id=\"startdate\" min=\"2000-01-01\" max=\"2100-12-31\"/>\r\n                <label for=\"startdate\">Start Date*</label>\r\n                <span class=\"error\"></span>\r\n            </div>\r\n            <div class=\"form__dates-end\">\r\n                <input type=\"date\" id=\"enddate\" min=\"2000-01-01\" max=\"2100-12-31\"/>\r\n                <label for=\"enddate\">End Date*</label>\r\n                <span class=\"error\"></span>\r\n            </div>\r\n         </div>\r\n        \r\n\r\n         <div class=\"form__dealerId\">\r\n            <input type=\"text\" placeholder=\"Dealer ID\" id=\"dealerid\"/>\r\n            <label for=\"dealerid\">DEALER ID*</label>\r\n            <span class=\"error\"></span>\r\n         </div>\r\n        \r\n\r\n         <button id=\"submit\"> SUBMIT </button>\r\n    </form>\r\n\r\n    </div>\r\n   </div>\r\n\r\n   ");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\r\n    ");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        String var_templateoptions1_field$_categories = "backofficetools.site";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

