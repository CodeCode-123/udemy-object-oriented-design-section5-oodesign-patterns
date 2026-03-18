package object_oriented_design_patterns.assignment_api_builder_pattern;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

public class SearchQueryBuilderExample {
	public static BoolQueryBuilder builderComplexQuery() {
		// Create individual match queries
		MatchQueryBuilder matchQuery1 = QueryBuilders.matchQuery("content", "quick");
		MatchQueryBuilder matchQuery2 = QueryBuilders.matchQuery("content", "lazy");
		MatchQueryBuilder matchQuery3 = QueryBuilders.matchQuery("title", "java");
		
		// Build the main boolean query
		BoolQueryBuilder boolQuery = QueryBuilders.boolQuery()
				.must(matchQuery1) // Equivalent to AND
				.should(matchQuery2) // Equivalent to OR (unless 'must'/'filter' are absent)
				.filter(matchQuery3); // Must match
		boolQuery.minimumShouldMatch(1);
		return boolQuery;
	}
}
