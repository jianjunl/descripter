/* Generated By:JJTree: Do not edit this line. ECMAForVarInStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ECMA,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.descripter.js.parse;

public
class ECMAForVarInStatement extends AbstractNode {
  public ECMAForVarInStatement(int id) {
    super(id);
  }

  public ECMAForVarInStatement(JSParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JSParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=12e5f3ff86c24e4600d82c329afeff60 (do not edit this line) */
