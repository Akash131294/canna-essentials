/*
 *   The MIT License (MIT)
 *
 *   Copyright (c) 2015 Shopify Inc.
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */

package com.shopify.canna.view.checkout;

import com.shopify.canna.domain.model.Payment;
import com.shopify.canna.view.LifeCycleBoundCallback;
import com.shopify.canna.view.ViewModel;

import java.util.UUID;

@SuppressWarnings("WeakerAccess")
public interface CheckoutViewModel extends ViewModel {
  int REQUEST_ID_UPDATE_CHECKOUT_SHIPPING_ADDRESS = UUID.randomUUID().hashCode();
  int REQUEST_ID_APPLY_SHIPPING_RATE = UUID.randomUUID().hashCode();
  int REQUEST_ID_CONFIRM_CHECKOUT = UUID.randomUUID().hashCode();
  int REQUEST_ID_COMPLETE_CHECKOUT = UUID.randomUUID().hashCode();

  void confirmCheckout();

  LifeCycleBoundCallback<Payment> successPaymentLiveData();

  class ShippingRateMissingException extends RuntimeException {
  }
}
