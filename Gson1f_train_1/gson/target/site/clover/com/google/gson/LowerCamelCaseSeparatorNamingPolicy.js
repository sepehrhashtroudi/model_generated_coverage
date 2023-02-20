var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":1988,"methods":[{"el":42,"sc":3,"sl":40}],"name":"LowerCamelCaseSeparatorNamingPolicy","sl":38}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_146":{"methods":[{"sl":40}],"name":"testUsingDashesInstead1","pass":true,"statements":[{"sl":41}]},"test_95":{"methods":[{"sl":40}],"name":"testGsonWithNonDefaultFieldNamingPolicySerialization36","pass":true,"statements":[{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [146, 95], [146, 95], [], []]
