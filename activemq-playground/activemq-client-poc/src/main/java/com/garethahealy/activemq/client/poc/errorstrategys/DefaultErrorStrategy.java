/*
 * #%L
 * activemq-client-poc
 * %%
 * Copyright (C) 2013 - 2014 Gareth Healy
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
package com.garethahealy.activemq.client.poc.errorstrategys;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultErrorStrategy implements AmqErrorStrategy {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultErrorStrategy.class);

    @Override
    public List<String[]> getBackedupLines(String queueName) {
        return new ArrayList<String[]>();
    }

    @Override
    public void handle(Throwable ex, String queueName, Object[] body) {
        LOG.error("Exception producing message {} to queue:{} because {}", body, queueName, ExceptionUtils.getStackTrace(ex));
    }
}
