/* Generated By:JJTree: Do not edit this line. ECMAForVarStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ECMA,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.descripter.js.parse;

public
class ECMAForVarStatement extends AbstractNode {
  public ECMAForVarStatement(int id) {
    super(id);
  }

  public ECMAForVarStatement(JSParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JSParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=f6ea03081763667fa67b9fca2c54aa3b (do not edit this line) */