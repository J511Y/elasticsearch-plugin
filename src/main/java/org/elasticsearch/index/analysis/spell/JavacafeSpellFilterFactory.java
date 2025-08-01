package org.elasticsearch.index.analysis.spell;

import org.apache.lucene.analysis.TokenStream;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.AbstractTokenFilterFactory;

public class JavacafeSpellFilterFactory extends AbstractTokenFilterFactory {

    public JavacafeSpellFilterFactory(IndexSettings indexSettings, Environment env, String name, Settings settings) {
        super(name, settings);
    }

    @Override
    public TokenStream create(TokenStream stream) {
        return new JavacafeSpellFilter(stream);
    }

}
