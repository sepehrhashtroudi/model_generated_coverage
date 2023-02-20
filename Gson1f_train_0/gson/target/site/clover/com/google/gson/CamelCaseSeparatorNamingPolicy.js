var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":73,"id":6,"methods":[{"el":57,"sc":3,"sl":53},{"el":72,"sc":3,"sl":59}],"name":"CamelCaseSeparatorNamingPolicy","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_145":{"methods":[{"sl":53},{"sl":59}],"name":"testUsingDashesInstead1","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":71}]},"test_166":{"methods":[{"sl":59}],"name":"testAllUpperCaseExceptFirst170","pass":true,"statements":[{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":71}]},"test_179":{"methods":[{"sl":53},{"sl":59}],"name":"testGsonWithUpperCamelCaseSpacesPolicyDeserialiation156","pass":true,"statements":[{"sl":54},{"sl":55},{"sl":56},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":68},{"sl":71}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [179, 145], [179, 145], [179, 145], [179, 145], [], [], [166, 179, 145], [], [], [166, 179, 145], [166, 179, 145], [166, 179, 145], [166, 179, 145], [166, 179, 145], [], [166, 179, 145], [], [], [166, 179, 145], [], []]
