/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.hexagonal.domain;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

/**
 * Tests for lottery ticket id
 */
class LotteryTicketIdTest {

  @Test
  void testEquals() {
    LotteryTicketId ticketId1 = new LotteryTicketId();
    LotteryTicketId ticketId2 = new LotteryTicketId();
    LotteryTicketId ticketId3 = new LotteryTicketId();
    assertNotEquals(ticketId1, ticketId2);
    assertNotEquals(ticketId2, ticketId3);
    LotteryTicketId ticketId4 = new LotteryTicketId(ticketId1.getId());
    assertEquals(ticketId1, ticketId4);
  }

  @Test
  void testGetId() {
    LotteryTicketId ticket = Mockito.mock(LotteryTicketId.class);

    when(ticket.getId()).thenReturn(666);

    assertEquals(ticket.getId(), 666);
  }
}
