/* Generated By:JJTree: Do not edit this line. JSSPScript.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=JSSP,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.descripter.js.ss.parse;

public
class JSSPScript extends AbstractNode {
  public JSSPScript(int id) {
    super(id);
  }

  public JSSPScript(JSSPParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JSSPParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=91dbc1c57b9dfab2411575e099527088 (do not edit this line) */
