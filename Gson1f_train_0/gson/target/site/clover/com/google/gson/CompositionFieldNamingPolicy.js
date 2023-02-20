var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":36,"methods":[{"el":37,"sc":3,"sl":32},{"el":45,"sc":3,"sl":39}],"name":"CompositionFieldNamingPolicy","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_145":{"methods":[{"sl":32},{"sl":39}],"name":"testUsingDashesInstead1","pass":true,"statements":[{"sl":33},{"sl":36},{"sl":41},{"sl":42},{"sl":44}]},"test_166":{"methods":[{"sl":39}],"name":"testAllUpperCaseExceptFirst170","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":44}]},"test_179":{"methods":[{"sl":32},{"sl":39}],"name":"testGsonWithUpperCamelCaseSpacesPolicyDeserialiation156","pass":true,"statements":[{"sl":33},{"sl":36},{"sl":41},{"sl":42},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [179, 145], [179, 145], [], [], [179, 145], [], [], [179, 145, 166], [], [179, 145, 166], [179, 145, 166], [], [179, 145, 166], [], []]
