/* Generated By:JJTree: Do not edit this line. ECMAAndOperation.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=ECMA,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.descripter.js.parse;

public
class ECMAAndOperation extends AbstractNode {
  public ECMAAndOperation(int id) {
    super(id);
  }

  public ECMAAndOperation(JSParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JSParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2c9d8857bb0c3e0231e04c70f608e8c6 (do not edit this line) */