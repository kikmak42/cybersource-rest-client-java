
# Ptsv2paymentsOrderInformationLineItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productCode** | **String** | Type of product. This value is used to determine the category that the product is in: electronic, handling, physical, service, or shipping. The default value is **default**. If you are performing an authorization transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;false&#x60;), and you set this field to a value other than default or any of the values related to shipping and handling, then the fields &#x60;quantity&#x60;, &#x60;productName&#x60;, and &#x60;productSku&#x60; are required. It can also have a value of \&quot;gift_card\&quot;.  See Appendix O, \&quot;Product Codes,\&quot; on page 373 for a list of valid values. For a payment, when you set this field to a value other than default or any of the values related to shipping and handling, below fields _quantity_, _productName_, and _productSKU_ are required.  |  [optional]
**productName** | **String** | For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to &#x60;default&#x60; or one of the other values that are related to shipping and/or handling.  |  [optional]
**productSku** | **String** | Stock Keeping Unit (SKU) code for the product.  For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when _orderInformation.lineItems[].productCode_ is not set to **default** or one of the other values that are related to shipping and/or handling.  |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) | Number of units for this order. For an authorization or capture transaction (&#x60;processingOptions.capture&#x60; is set to &#x60;true&#x60; or &#x60;false&#x60;), this field is required when &#x60;orderInformation.lineItems[].productCode&#x60; is not set to &#x60;default&#x60; or one of the other values that are related to shipping and/or handling. When &#x60;orderInformation.lineItems[].productCode&#x60; is &#x60;gift_card&#x60;, this is the total count of individual prepaid gift cards purchased.  |  [optional]
**unitPrice** | **String** | Per-item price of the product. This value cannot be negative. You can include a decimal point (.), but you cannot include any other special characters. CyberSource truncates the amount to the correct number of decimal places.  For processor-specific information, see the amount field in [Credit Card Services Using the SCMP API.](http://apps.cybersource.com/library/documentation/dev_guides/CC_Svcs_SCMP_API/html)  **Important** Some processors have specific requirements and limitations, such as maximum amounts and maximum field lengths. This information is covered in: - Table 12, \&quot;Authorization Information for Specific Processors,\&quot; on page 36 - Table 16, \&quot;Capture Information for Specific Processors,\&quot; on page 51 - Table 20, \&quot;Credit Information for Specific Processors,\&quot; on page 65  **DCC for First Data**\\ This value is the original amount in your local currency. You must include this field. You cannot use grand_total_amount. See \&quot;Dynamic Currency Conversion for First Data,\&quot; page 113.  **FDMS South**\\ If you accept IDR or CLP currencies, see the entry for FDMS South in Table 12, \&quot;Authorization Information for Specific Processors,\&quot; on page 36.  **Zero Amount Authorizations**\\ If your processor supports zero amount authorizations, you can set this field to 0 for the authorization to check if the card is lost or stolen. See \&quot;Zero Amount Authorizations,\&quot; page 220.  |  [optional]
**unitOfMeasure** | **String** | Unit of measure, or unit of measure code, for the item.  |  [optional]
**totalAmount** | **String** | Total amount for the item. Normally calculated as the unit price x quantity.  When orderInformation.lineItems[].productCode is \&quot;gift_card\&quot;, this is the purchase amount total for prepaid gift cards in major units. Example: 123.45 USD&#x3D; 123  |  [optional]
**taxAmount** | **String** | Total tax to apply to the product. This value cannot be negative. The tax amount and the offer amount must be in the same currency. The tax amount field is additive.  The following example uses a two-exponent currency such as USD:   1. You include each line item in your request.  ..- 1st line item has amount&#x3D;10.00, quantity&#x3D;1, and taxAmount&#x3D;0.80  ..- 2nd line item has amount&#x3D;20.00, quantity&#x3D;1, and taxAmount&#x3D;1.60  2. The total amount authorized will be 32.40, not 30.00 with 2.40 of tax included.  If you want to include the tax amount and also request the ics_tax service, see Tax Calculation Service Using the SCMP API.  This field is frequently used for Level II and Level III transactions. See Level II and Level III Processing Using the SCMP API.  |  [optional]
**taxRate** | **String** | Tax rate applied to the item. See \&quot;Numbered Elements,\&quot; page 14.  Visa: Valid range is 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated).  Mastercard: Valid range is 0.00001 to 0.99999 (0.001% to 99.999%).  |  [optional]
**taxAppliedAfterDiscount** | **String** | Flag to indicate how you handle discount at the line item level.   - 0: no line level discount provided  - 1: tax was calculated on the post-discount line item total  - 2: tax was calculated on the pre-discount line item total  &#x60;Note&#x60; Visa will inset 0 (zero) if an invalid value is included in this field.  This field relates to the value in the _lineItems[].discountAmount_ field.  |  [optional]
**taxStatusIndicator** | **String** | Flag to indicate whether tax is exempted or not included.   - 0: tax not included  - 1: tax included  - 2: transaction is not subject to tax  |  [optional]
**taxTypeCode** | **String** | Type of tax being applied to the item. Possible values:  Below values are used by **RBS WorldPay Atlanta**, **FDC Nashville Global**, **Litle**   - 0000: unknown tax type  - 0001: federal/national sales tax  - 0002: state sales tax  - 0003: city sales tax  - 0004: local sales tax  - 0005: municipal sales tax  - 0006: other tax  - 0010: value-added tax (VAT)  - 0011: goods and services tax (GST)  - 0012: provincial sales tax  - 0013: harmonized sales tax  - 0014: Quebec sales tax (QST)  - 0020: room tax  - 0021: occupancy tax  - 0022: energy tax  - 0023: city tax  - 0024: county or parish sales tax  - 0025: county tax  - 0026: environment tax  - 0027: state and local sales tax (combined)  - Blank: Tax not supported on line item.  |  [optional]
**amountIncludesTax** | **Boolean** | Flag that indicates whether the tax amount is included in the Line Item Total.  Possible values:  - **true**  - **false**  |  [optional]
**typeOfSupply** | **String** | Flag to indicate whether the purchase is categorized as goods or services. Possible values:   - 00: goods  - 01: services  |  [optional]
**commodityCode** | **String** | Commodity code or International description code used to classify the item. Contact your acquirer for a list of codes.  |  [optional]
**discountAmount** | **String** | Discount applied to the item. |  [optional]
**discountApplied** | **Boolean** | Flag that indicates whether the amount is discounted.  If you do not provide a value but you set Discount Amount to a value greater than zero, then CyberSource sets this field to **true**.  Possible values:  - **true**  - **false**  |  [optional]
**discountRate** | **String** | Rate the item is discounted. Maximum of 2 decimal places.  Example 5.25 (&#x3D;5.25%)  |  [optional]
**invoiceNumber** | **String** | Field to support an invoice number for a transaction. You must specify the number of line items that will include an invoice number. By default, the first line item will include an invoice number field. The invoice number field can be included for up to 10 line items.  |  [optional]
**taxDetails** | [**List&lt;Ptsv2paymentsOrderInformationAmountDetailsTaxDetails&gt;**](Ptsv2paymentsOrderInformationAmountDetailsTaxDetails.md) |  |  [optional]
**fulfillmentType** | **String** | The description for this field is not available. |  [optional]
**weight** | **String** | Weight of the item. See Numbered Elements. |  [optional]
**weightIdentifier** | **String** | Type of weight. See Numbered Elements.  Possible values: - B: Billed weight - N: Actual net weight  |  [optional]
**weightUnit** | **String** | Code that specifies the unit of measurement for the weight amount. For example, OZ specifies ounce and LB specifies pound. The possible values are defined by the ANSI Accredited Standards Committee (ASC).  See Numbered Elements.  |  [optional]
**referenceDataCode** | **String** | Code that identifies the value of the corresponding item_#_referenceData_#_number field. See Numbered Elements.  Possible values: - AN: Client-defined asset code - MG: Manufacturer&#39;s part number - PO: Purchase order number - SK: Supplier stock keeping unit number - UP: Universal product code - VC: Supplier catalog number - VP: Vendor part number  This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor.  |  [optional]
**referenceDataNumber** | **String** | Reference number.  The meaning of this value is identified by the value of the corresponding &#x60;referenceDataCode&#x60; field. See Numbered Elements.  The maximum length for this field depends on the value of the corresponding &#x60;referenceDataCode&#x60; field: - When the code is &#x60;PO&#x60;, the maximum length for the reference number is 22. - When the code is &#x60;VC&#x60;, the maximum length for the reference number is 20. - For all other codes, the maximum length for the reference number is 30.  This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor.  |  [optional]


