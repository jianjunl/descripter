/* Generated By:JJTree: Do not edit this line. ECMACase.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ECMA,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.descripter.js.parse;

public
class ECMACase extends AbstractNode {
  public ECMACase(int id) {
    super(id);
  }

  public ECMACase(JSParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JSParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=092fc07c448be7ff43773cf133f639c1 (do not edit this line) */
