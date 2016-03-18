package org.eclipse.fx.code.editor.configuration;

public interface PartitionRule_DynamicEnd extends EditorBase, PartitionRule {
	public String getBeginPrefix();
	public String getBeginMatch();
	public String getEndTemplate();
	public Check getCheck();
	public Condition getCondition();

	public interface Builder {
		public Builder beginPrefix(String beginPrefix);
		public Builder beginMatch(String beginMatch);
		public Builder endTemplate(String endTemplate);
		public Builder check(Check check);
		public Builder condition(Condition condition);
		public PartitionRule_DynamicEnd build();
	}
}