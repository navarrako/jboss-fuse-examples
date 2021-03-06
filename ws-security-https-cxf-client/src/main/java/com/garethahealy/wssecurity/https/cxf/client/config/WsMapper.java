/*
 * #%L
 * ws-security-https-cxf-client
 * %%
 * Copyright (C) 2013 - 2015 Gareth Healy
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.garethahealy.wssecurity.https.cxf.client.config;

import java.util.Map;

public class WsMapper {

    //TODO: create a tree object which can mimic the structure of an object

    private String operationName;
    private String className;
    private Map<String, Object> methodNameToValue;

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<String, Object> getMethodNameToValue() {
        return methodNameToValue;
    }

    public void setMethodNameToValue(Map<String, Object> methodNameToValue) {
        this.methodNameToValue = methodNameToValue;
    }
}
