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
package org.apache.sling.scripting.sightly.apps.laser.components.pages.base;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.java.compiler.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class base_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_hellomodel = null;
out.write("<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n    <title>Laser Base Page</title>\r\n</head>\r\n<body>\r\n    ");
_global_hellomodel = renderContext.call("use", "by.gstu.laser.api.model.Hello", obj());
out.write("<div>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_hellomodel, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\r\n</body>\r\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

