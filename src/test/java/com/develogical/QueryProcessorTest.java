package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void knowsAboutShakespeare() throws Exception {
    assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  }

  @Test
  public void knowsPlayersName() throws Exception {
    assertThat(queryProcessor.process("What is your name?"), containsString("WeatheredWaterfall"));
  }

  @Test
  public void knows22Plus54() throws Exception {
    assertThat(queryProcessor.process("What is 22 plus 54?"), containsString("76"));
  }

  @Test
  public void knowsLargestFrom19_5_98() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 19, 5, 98?"), containsString("98"));
  }

//  @Test
//  public void knowsPlayersName() throws Exception {
//    assertThat(queryProcessor.process(""), containsString(""));
//  }
}
