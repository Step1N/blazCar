package com.blazcar.shopper.utils;

import org.dozer.DozerConverter;
import org.joda.time.DateTime;

public class DateFormatter extends DozerConverter<DateTime, DateTime> {

  public DateFormatter() {
    super(DateTime.class, DateTime.class);
  }

  @Override
  public DateTime convertTo(final DateTime source, final DateTime destination) {

    if (source == null) {
      return null;
    }

    return new DateTime(source);
  }

  @Override
  public DateTime convertFrom(final DateTime source, final DateTime destination) {

    if (source == null) {
      return null;
    }

    return new DateTime(source);
  }
}
