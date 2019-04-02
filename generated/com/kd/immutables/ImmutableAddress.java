package com.kd.immutables;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Address}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAddress.builder()}.
 */
@SuppressWarnings({"all"})
@Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAddress implements Address {
  private final String city;
  private final String street;
  private final int zipcode;

  private ImmutableAddress(ImmutableAddress.Builder builder) {
    this.city = builder.city;
    this.street = builder.street;
    this.zipcode = builder.zipcodeIsSet()
        ? builder.zipcode
        : Address.super.zipcode();
  }

  private ImmutableAddress(String city, String street, int zipcode) {
    this.city = city;
    this.street = street;
    this.zipcode = zipcode;
  }

  /**
   * @return The value of the {@code city} attribute
   */
  @JsonProperty("city")
  @Override
  public String city() {
    return city;
  }

  /**
   * @return The value of the {@code street} attribute
   */
  @JsonProperty("street")
  @Override
  public String street() {
    return street;
  }

  /**
   * @return The value of the {@code zipcode} attribute
   */
  @JsonProperty("zip")
  @Override
  public int zipcode() {
    return zipcode;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Address#city() city} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for city
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddress withCity(String value) {
    if (this.city.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "city");
    return new ImmutableAddress(newValue, this.street, this.zipcode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Address#street() street} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for street
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddress withStreet(String value) {
    if (this.street.equals(value)) return this;
    String newValue = Objects.requireNonNull(value, "street");
    return new ImmutableAddress(this.city, newValue, this.zipcode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Address#zipcode() zipcode} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for zipcode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAddress withZipcode(int value) {
    if (this.zipcode == value) return this;
    return new ImmutableAddress(this.city, this.street, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAddress} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAddress
        && equalTo((ImmutableAddress) another);
  }

  private boolean equalTo(ImmutableAddress another) {
    return city.equals(another.city)
        && street.equals(another.street)
        && zipcode == another.zipcode;
  }

  /**
   * Computes a hash code from attributes: {@code city}, {@code street}, {@code zipcode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + city.hashCode();
    h += (h << 5) + street.hashCode();
    h += (h << 5) + zipcode;
    return h;
  }

  /**
   * Prints the immutable value {@code Address} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Address")
        .omitNullValues()
        .add("city", city)
        .add("street", street)
        .add("zipcode", zipcode)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Address {
    String city;
    String street;
    int zipcode;
    boolean zipcodeIsSet;
    @JsonProperty("city")
    public void setCity(String city) {
      this.city = city;
    }
    @JsonProperty("street")
    public void setStreet(String street) {
      this.street = street;
    }
    @JsonProperty("zip")
    public void setZipcode(int zipcode) {
      this.zipcode = zipcode;
      this.zipcodeIsSet = true;
    }
    @Override
    public String city() { throw new UnsupportedOperationException(); }
    @Override
    public String street() { throw new UnsupportedOperationException(); }
    @Override
    public int zipcode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAddress fromJson(Json json) {
    ImmutableAddress.Builder builder = ImmutableAddress.builder();
    if (json.city != null) {
      builder.city(json.city);
    }
    if (json.street != null) {
      builder.street(json.street);
    }
    if (json.zipcodeIsSet) {
      builder.zipcode(json.zipcode);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Address} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Address instance
   */
  public static ImmutableAddress copyOf(Address instance) {
    if (instance instanceof ImmutableAddress) {
      return (ImmutableAddress) instance;
    }
    return ImmutableAddress.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAddress ImmutableAddress}.
   * @return A new ImmutableAddress builder
   */
  public static ImmutableAddress.Builder builder() {
    return new ImmutableAddress.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAddress ImmutableAddress}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_CITY = 0x1L;
    private static final long INIT_BIT_STREET = 0x2L;
    private static final long OPT_BIT_ZIPCODE = 0x1L;
    private long initBits = 0x3L;
    private long optBits;

    private String city;
    private String street;
    private int zipcode;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Address} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Address instance) {
      Objects.requireNonNull(instance, "instance");
      city(instance.city());
      street(instance.street());
      zipcode(instance.zipcode());
      return this;
    }

    /**
     * Initializes the value for the {@link Address#city() city} attribute.
     * @param city The value for city 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("city")
    public final Builder city(String city) {
      this.city = Objects.requireNonNull(city, "city");
      initBits &= ~INIT_BIT_CITY;
      return this;
    }

    /**
     * Initializes the value for the {@link Address#street() street} attribute.
     * @param street The value for street 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("street")
    public final Builder street(String street) {
      this.street = Objects.requireNonNull(street, "street");
      initBits &= ~INIT_BIT_STREET;
      return this;
    }

    /**
     * Initializes the value for the {@link Address#zipcode() zipcode} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Address#zipcode() zipcode}.</em>
     * @param zipcode The value for zipcode 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("zip")
    public final Builder zipcode(int zipcode) {
      this.zipcode = zipcode;
      optBits |= OPT_BIT_ZIPCODE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAddress ImmutableAddress}.
     * @return An immutable instance of Address
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAddress build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAddress(this);
    }

    private boolean zipcodeIsSet() {
      return (optBits & OPT_BIT_ZIPCODE) != 0;
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_CITY) != 0) attributes.add("city");
      if ((initBits & INIT_BIT_STREET) != 0) attributes.add("street");
      return "Cannot build Address, some of required attributes are not set " + attributes;
    }
  }
}
