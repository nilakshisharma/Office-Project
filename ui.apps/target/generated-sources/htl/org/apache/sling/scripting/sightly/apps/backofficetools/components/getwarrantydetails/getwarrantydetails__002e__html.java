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
package org.apache.sling.scripting.sightly.apps.backofficetools.components.getwarrantydetails;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class getwarrantydetails__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
out.write("<head>\r\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n  ");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\r\n    ");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions1_field$_categories = "backofficetools.site";
        {
            java.util.Map var_templateoptions1 = obj().with("categories", var_templateoptions1_field$_categories);
            callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
        }
    }
}
out.write("\r\n</head>\r\n<div class=\"boxofficegetwarranty\">\r\n  <div class=\"searchbox\">\r\n    <select class=\"searchbox__searchby\" name=\"Searchby\">\r\n      <option value=\"modelId\">Model Id</option>\r\n      <option value=\"productId\">Product Id</option>\r\n      <option value=\"startDate\">Start Date</option>\r\n      <option value=\"endDate\">End Date</option>\r\n      <option value=\"dealerId\">Dealer Id</option>\r\n    </select>\r\n    <input class=\"searchbox__input\" type=\"text\" placeholder=\"Enter Model Id\"/>\r\n    <div class=\"searchbox__icon\">\r\n      <svg class=\"searchbox__icon--svg\" fill=\"#000000\" height=\"800px\" width=\"800px\" version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 488.4 488.4\" xml:space=\"preserve\">\r\n          <g>\r\n              <g>\r\n                  <path d=\"M0,203.25c0,112.1,91.2,203.2,203.2,203.2c51.6,0,98.8-19.4,134.7-51.2l129.5,129.5c2.4,2.4,5.5,3.6,8.7,3.6\r\ns6.3-1.2,8.7-3.6c4.8-4.8,4.8-12.5,0-17.3l-129.6-129.5c31.8-35.9,51.2-83,51.2-134.7c0-112.1-91.2-203.2-203.2-203.2\r\nS0,91.15,0,203.25z M381.9,203.25c0,98.5-80.2,178.7-178.7,178.7s-178.7-80.2-178.7-178.7s80.2-178.7,178.7-178.7\r\nS381.9,104.65,381.9,203.25z\"/>\r\n              </g>\r\n          </g>\r\n      </svg>\r\n  </div>\r\n  </div>\r\n  <div class=\"searchresult\">\r\n    <table class=\"searchresult__table\" border>\r\n        <thead>\r\n            <tr>\r\n                <th>Seriel No.</th>\r\n                <th>Model Id</th>\r\n                <th>Product Id</th>\r\n                <th>Start Date</th>\r\n                <th>End Date</th>  \r\n                <th>Dealer Id</th>  \r\n            </tr>\r\n        </thead>\r\n        <tbody class=\"searchresult__table--tbody\">\r\n        </tbody>\r\n    </table>\r\n  </div>\r\n  <div class=\"fallbackresult\">\r\n    <h4 class=\"fallbackresult__title\">Search Warranty Details</h4>\r\n  </div>\r\n</div>\r\n");
{
    Object var_templatevar2 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
    {
        String var_templateoptions3_field$_categories = "backofficetools.site";
        {
            java.util.Map var_templateoptions3 = obj().with("categories", var_templateoptions3_field$_categories);
            callUnit(out, renderContext, var_templatevar2, var_templateoptions3);
        }
    }
}
out.write("\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

