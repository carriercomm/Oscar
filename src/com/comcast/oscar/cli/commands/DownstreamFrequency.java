package com.comcast.oscar.cli.commands;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;

/**
 * 
 * @author Allen Flickinger (allen.flickinger@gmail.com)
 * 
 * @bannerLicense
	Copyright 2015 Comcast Cable Communications Management, LLC<br>
	___________________________________________________________________<br>
	Licensed under the Apache License, Version 2.0 (the "License")<br>
	you may not use this file except in compliance with the License.<br>
	You may obtain a copy of the License at<br>
	http://www.apache.org/licenses/LICENSE-2.0<br>
	Unless required by applicable law or agreed to in writing, software<br>
	distributed under the License is distributed on an "AS IS" BASIS,<br>
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br>
	See the License for the specific language governing permissions and<br>
	limitations under the License.<br>

 */

public class DownstreamFrequency {

	private final String[] args;
	
	/**
	 * Get Downstream Frequency arguments
	 * @param args
	 */
	public DownstreamFrequency(String[] args) {
		this.args = args;
	}
	
	/**
	 * Set option parameters for command Downstream Frequency
	 * @return Option
	 */
	public static final Option OptionParameters() {
		OptionBuilder.withArgName("downstream frequency");
		OptionBuilder.hasArgs(1);
		OptionBuilder.hasOptionalArgs();
        OptionBuilder.withValueSeparator(' ');
        OptionBuilder.withLongOpt("dsfreq");
        OptionBuilder.withDescription("Insert this downstream frequency during file compilation EX: 723000000.");
		return OptionBuilder.create("df");
	}
	
	/**
	 * Return Downstream Frequency file
	 * @return int
	 */
	public int getDownstreamFrequency() {
		if(this.args[0] != null) {
			return Integer.valueOf(this.args[0]);
		} 
		else {
			return -1;
		}
	}
}
