var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":88,"id":32429,"methods":[{"el":67,"sc":1,"sl":63},{"el":74,"sc":1,"sl":70}],"name":"TestFiltering","sl":13},{"el":25,"id":32429,"methods":[],"name":"TestFiltering.Bean","sl":22},{"el":55,"id":32429,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":48,"sc":9,"sl":44},{"el":53,"sc":9,"sl":50}],"name":"TestFiltering.Pod","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_221":{"methods":[{"sl":70}],"name":"testDefaultFilter386","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73}]},"test_231":{"methods":[{"sl":63}],"name":"testSimpleExclusionFilter169","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [231], [231], [231], [231], [], [], [], [221], [221], [221], [221], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
