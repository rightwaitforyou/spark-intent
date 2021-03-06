package de.kp.spark.intent.markov
/* Copyright (c) 2014 Dr. Krusche & Partner PartG
* 
* This file is part of the Spark-Intent project
* (https://github.com/skrusche63/spark-intent).
* 
* Spark-Intent is free software: you can redistribute it and/or modify it under the
* terms of the GNU General Public License as published by the Free Software
* Foundation, either version 3 of the License, or (at your option) any later
* version.
* 
* Spark-Intent is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
* A PARTICULAR PURPOSE. See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with
* Spark-Intent. 
* 
* If not, see <http://www.gnu.org/licenses/>.
*/

abstract class MarkovBuilder {

  /**
   * Retrieve scaling factor for scaled markov models; this
   * parameters is not used by Hidden Markov models
   */
  def scale:Int = 0
  /**
   * Retrieve observable states
   */
  def ostates:Array[String] = Array.empty[String]
  /**
   * Retrieve hidden states
   */
  def hstates:Array[String] = Array.empty[String]
  
}