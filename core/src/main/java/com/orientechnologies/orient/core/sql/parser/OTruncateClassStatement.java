/* Generated By:JJTree: Do not edit this line. OTruncateClassStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OTruncateClassStatement extends OStatement {

  protected OIdentifier className;
  protected boolean polymorphic = false;
  protected boolean unsafe      = false;

  public OTruncateClassStatement(int id) {
    super(id);
  }

  public OTruncateClassStatement(OrientSql p, int id) {
    super(p, id);
  }

  /**
   * Accept the visitor.
   **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("TRUNCATE CLASS " + className.toString());
    if (polymorphic) {
      builder.append(" POLYMORPHIC");
    }
    if (unsafe) {
      builder.append(" UNSAFE");
    }
  }

  @Override public OTruncateClassStatement copy() {
    OTruncateClassStatement result = new OTruncateClassStatement(-1);
    result.className = className == null ? null : className.copy();
    result.polymorphic = polymorphic;
    result.unsafe = unsafe;
    return result;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    OTruncateClassStatement that = (OTruncateClassStatement) o;

    if (polymorphic != that.polymorphic)
      return false;
    if (unsafe != that.unsafe)
      return false;
    if (className != null ? !className.equals(that.className) : that.className != null)
      return false;

    return true;
  }

  @Override public int hashCode() {
    int result = className != null ? className.hashCode() : 0;
    result = 31 * result + (polymorphic ? 1 : 0);
    result = 31 * result + (unsafe ? 1 : 0);
    return result;
  }
}
/* JavaCC - OriginalChecksum=301f993f6ba2893cb30c8f189674b974 (do not edit this line) */