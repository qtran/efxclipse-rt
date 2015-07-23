/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.fx.code.editor.ldef.services.LDefGrammarAccess;

public class LDefParser extends AbstractContentAssistParser {
	
	@Inject
	private LDefGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser createParser() {
		org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser result = new org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCodeIntegrationAccess().getAlternatives(), "rule__CodeIntegration__Alternatives");
					put(grammarAccess.getPartitionerAccess().getAlternatives(), "rule__Partitioner__Alternatives");
					put(grammarAccess.getPartition_RuleAccess().getAlternatives(), "rule__Partition_Rule__Alternatives");
					put(grammarAccess.getLexicalPartitionHighlightingAccess().getAlternatives(), "rule__LexicalPartitionHighlighting__Alternatives");
					put(grammarAccess.getScannerAccess().getAlternatives(), "rule__Scanner__Alternatives");
					put(grammarAccess.getScanner_RuleAccess().getAlternatives(), "rule__Scanner_Rule__Alternatives");
					put(grammarAccess.getWhitespaceRuleAccess().getAlternatives_1(), "rule__WhitespaceRule__Alternatives_1");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup(), "rule__QualifiedNameWithWildCard__Group__0");
					put(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup_1(), "rule__QualifiedNameWithWildCard__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getLanguageDefAccess().getGroup(), "rule__LanguageDef__Group__0");
					put(grammarAccess.getIntegrationAccess().getGroup(), "rule__Integration__Group__0");
					put(grammarAccess.getJavaFXIntegrationAccess().getGroup(), "rule__JavaFXIntegration__Group__0");
					put(grammarAccess.getSWTIntegrationAccess().getGroup(), "rule__SWTIntegration__Group__0");
					put(grammarAccess.getParitioningAccess().getGroup(), "rule__Paritioning__Group__0");
					put(grammarAccess.getPartitionAccess().getGroup(), "rule__Partition__Group__0");
					put(grammarAccess.getParitioner_JSAccess().getGroup(), "rule__Paritioner_JS__Group__0");
					put(grammarAccess.getPartitioner_RuleAccess().getGroup(), "rule__Partitioner_Rule__Group__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup(), "rule__Partition_SingleLineRule__Group__0");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getGroup_5(), "rule__Partition_SingleLineRule__Group_5__0");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getGroup(), "rule__Partition_MultiLineRule__Group__0");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getGroup_5(), "rule__Partition_MultiLineRule__Group_5__0");
					put(grammarAccess.getLexicalHighlightingAccess().getGroup(), "rule__LexicalHighlighting__Group__0");
					put(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getGroup(), "rule__LexicalPartitionHighlighting_JS__Group__0");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getGroup(), "rule__LexicalPartitionHighlighting_Rule__Group__0");
					put(grammarAccess.getTokenAccess().getGroup(), "rule__Token__Group__0");
					put(grammarAccess.getTokenAccess().getGroup_2(), "rule__Token__Group_2__0");
					put(grammarAccess.getScanner_KeywordAccess().getGroup(), "rule__Scanner_Keyword__Group__0");
					put(grammarAccess.getScanner_KeywordAccess().getGroup_3(), "rule__Scanner_Keyword__Group_3__0");
					put(grammarAccess.getKeywordAccess().getGroup(), "rule__Keyword__Group__0");
					put(grammarAccess.getKeywordAccess().getGroup_1(), "rule__Keyword__Group_1__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup(), "rule__Scanner_SingleLineRule__Group__0");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getGroup_4(), "rule__Scanner_SingleLineRule__Group_4__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup(), "rule__Scanner_MultiLineRule__Group__0");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getGroup_4(), "rule__Scanner_MultiLineRule__Group_4__0");
					put(grammarAccess.getScanner_CharacterRuleAccess().getGroup(), "rule__Scanner_CharacterRule__Group__0");
					put(grammarAccess.getScanner_CharacterRuleAccess().getGroup_3(), "rule__Scanner_CharacterRule__Group_3__0");
					put(grammarAccess.getScanner_JSRuleAccess().getGroup(), "rule__Scanner_JSRule__Group__0");
					put(grammarAccess.getWhitespaceRuleAccess().getGroup(), "rule__WhitespaceRule__Group__0");
					put(grammarAccess.getWhitespaceRuleAccess().getGroup_1_0(), "rule__WhitespaceRule__Group_1_0__0");
					put(grammarAccess.getWhitespaceRuleAccess().getGroup_1_0_2(), "rule__WhitespaceRule__Group_1_0_2__0");
					put(grammarAccess.getRootAccess().getNameAssignment_1(), "rule__Root__NameAssignment_1");
					put(grammarAccess.getRootAccess().getImportsAssignment_2(), "rule__Root__ImportsAssignment_2");
					put(grammarAccess.getRootAccess().getLanguageDefinitionAssignment_3(), "rule__Root__LanguageDefinitionAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getLanguageDefAccess().getNameAssignment_0(), "rule__LanguageDef__NameAssignment_0");
					put(grammarAccess.getLanguageDefAccess().getParitioningAssignment_2(), "rule__LanguageDef__ParitioningAssignment_2");
					put(grammarAccess.getLanguageDefAccess().getLexicalHighlightingAssignment_3(), "rule__LanguageDef__LexicalHighlightingAssignment_3");
					put(grammarAccess.getLanguageDefAccess().getIntegrationAssignment_4(), "rule__LanguageDef__IntegrationAssignment_4");
					put(grammarAccess.getIntegrationAccess().getCodeIntegrationListAssignment_2(), "rule__Integration__CodeIntegrationListAssignment_2");
					put(grammarAccess.getJavaFXIntegrationAccess().getCodegenAssignment_3(), "rule__JavaFXIntegration__CodegenAssignment_3");
					put(grammarAccess.getJavaFXIntegrationAccess().getE4Assignment_4(), "rule__JavaFXIntegration__E4Assignment_4");
					put(grammarAccess.getSWTIntegrationAccess().getCodegenAssignment_3(), "rule__SWTIntegration__CodegenAssignment_3");
					put(grammarAccess.getSWTIntegrationAccess().getE4Assignment_4(), "rule__SWTIntegration__E4Assignment_4");
					put(grammarAccess.getParitioningAccess().getPartitionsAssignment_2(), "rule__Paritioning__PartitionsAssignment_2");
					put(grammarAccess.getParitioningAccess().getPartitionerAssignment_3(), "rule__Paritioning__PartitionerAssignment_3");
					put(grammarAccess.getPartitionAccess().getNameAssignment_1(), "rule__Partition__NameAssignment_1");
					put(grammarAccess.getParitioner_JSAccess().getScriptURIAssignment_1(), "rule__Paritioner_JS__ScriptURIAssignment_1");
					put(grammarAccess.getPartitioner_RuleAccess().getRuleListAssignment_2(), "rule__Partitioner_Rule__RuleListAssignment_2");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getParitionAssignment_1(), "rule__Partition_SingleLineRule__ParitionAssignment_1");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getStartSeqAssignment_2(), "rule__Partition_SingleLineRule__StartSeqAssignment_2");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getEndSeqAssignment_4(), "rule__Partition_SingleLineRule__EndSeqAssignment_4");
					put(grammarAccess.getPartition_SingleLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__Partition_SingleLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getParitionAssignment_1(), "rule__Partition_MultiLineRule__ParitionAssignment_1");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getStartSeqAssignment_2(), "rule__Partition_MultiLineRule__StartSeqAssignment_2");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getEndSeqAssignment_4(), "rule__Partition_MultiLineRule__EndSeqAssignment_4");
					put(grammarAccess.getPartition_MultiLineRuleAccess().getEscapeSeqAssignment_5_2(), "rule__Partition_MultiLineRule__EscapeSeqAssignment_5_2");
					put(grammarAccess.getLexicalHighlightingAccess().getListAssignment_2(), "rule__LexicalHighlighting__ListAssignment_2");
					put(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getPartitionAssignment_1(), "rule__LexicalPartitionHighlighting_JS__PartitionAssignment_1");
					put(grammarAccess.getLexicalPartitionHighlighting_JSAccess().getScriptURIAssignment_2(), "rule__LexicalPartitionHighlighting_JS__ScriptURIAssignment_2");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getPartitionAssignment_1(), "rule__LexicalPartitionHighlighting_Rule__PartitionAssignment_1");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getWhitespaceAssignment_2(), "rule__LexicalPartitionHighlighting_Rule__WhitespaceAssignment_2");
					put(grammarAccess.getLexicalPartitionHighlighting_RuleAccess().getTokenListAssignment_4(), "rule__LexicalPartitionHighlighting_Rule__TokenListAssignment_4");
					put(grammarAccess.getTokenAccess().getDefaultAssignment_0(), "rule__Token__DefaultAssignment_0");
					put(grammarAccess.getTokenAccess().getNameAssignment_1(), "rule__Token__NameAssignment_1");
					put(grammarAccess.getTokenAccess().getScannerListAssignment_2_1(), "rule__Token__ScannerListAssignment_2_1");
					put(grammarAccess.getScanner_KeywordAccess().getKeywordsAssignment_2(), "rule__Scanner_Keyword__KeywordsAssignment_2");
					put(grammarAccess.getScanner_KeywordAccess().getKeywordsAssignment_3_1(), "rule__Scanner_Keyword__KeywordsAssignment_3_1");
					put(grammarAccess.getKeywordAccess().getNameAssignment_0(), "rule__Keyword__NameAssignment_0");
					put(grammarAccess.getKeywordAccess().getVersionAssignment_1_1(), "rule__Keyword__VersionAssignment_1_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getStartSeqAssignment_1(), "rule__Scanner_SingleLineRule__StartSeqAssignment_1");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getEndSeqAssignment_3(), "rule__Scanner_SingleLineRule__EndSeqAssignment_3");
					put(grammarAccess.getScanner_SingleLineRuleAccess().getEscapeSeqAssignment_4_2(), "rule__Scanner_SingleLineRule__EscapeSeqAssignment_4_2");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getStartSeqAssignment_1(), "rule__Scanner_MultiLineRule__StartSeqAssignment_1");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getEndSeqAssignment_3(), "rule__Scanner_MultiLineRule__EndSeqAssignment_3");
					put(grammarAccess.getScanner_MultiLineRuleAccess().getEscapeSeqAssignment_4_2(), "rule__Scanner_MultiLineRule__EscapeSeqAssignment_4_2");
					put(grammarAccess.getScanner_CharacterRuleAccess().getCharactersAssignment_2(), "rule__Scanner_CharacterRule__CharactersAssignment_2");
					put(grammarAccess.getScanner_CharacterRuleAccess().getCharactersAssignment_3_1(), "rule__Scanner_CharacterRule__CharactersAssignment_3_1");
					put(grammarAccess.getScanner_JSRuleAccess().getFileURIAssignment_1(), "rule__Scanner_JSRule__FileURIAssignment_1");
					put(grammarAccess.getWhitespaceRuleAccess().getCharactersAssignment_1_0_1(), "rule__WhitespaceRule__CharactersAssignment_1_0_1");
					put(grammarAccess.getWhitespaceRuleAccess().getCharactersAssignment_1_0_2_1(), "rule__WhitespaceRule__CharactersAssignment_1_0_2_1");
					put(grammarAccess.getWhitespaceRuleAccess().getJavawhitespaceAssignment_1_1(), "rule__WhitespaceRule__JavawhitespaceAssignment_1_1");
					put(grammarAccess.getWhitespaceRuleAccess().getFileURIAssignment_1_2(), "rule__WhitespaceRule__FileURIAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser typedParser = (org.eclipse.fx.code.editor.ldef.ui.contentassist.antlr.internal.InternalLDefParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LDefGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LDefGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
