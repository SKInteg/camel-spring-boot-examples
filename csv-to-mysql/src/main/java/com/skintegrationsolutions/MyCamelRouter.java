/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.skintegrationsolutions;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.dataformat.csv.CsvDataFormat;

@Component
public class MyCamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
       
	CsvDataFormat csv = new CsvDataFormat();
	csv.setSkipHeaderRecord(true);
	   
	from("file:{{input-path}}")
	 .log("Received file ${header.CamelFileNameConsumed}")
	 .unmarshal(csv)
	 .split(body())
	 .log("Inserting record : ${body}")
	 .to("sql:INSERT INTO Employees (Name, Age, Address, PhoneNumber, Email, JobTitle) VALUES (#,#,#,#,#,#)")
	 .log("Done!");
	}

}
