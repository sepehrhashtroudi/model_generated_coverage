var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":79,"id":32648,"methods":[{"el":66,"sc":1,"sl":62}],"name":"TestFiltering","sl":13},{"el":25,"id":32648,"methods":[],"name":"TestFiltering.Bean","sl":22},{"el":55,"id":32648,"methods":[{"el":38,"sc":9,"sl":36},{"el":42,"sc":9,"sl":40},{"el":48,"sc":9,"sl":44},{"el":53,"sc":9,"sl":50}],"name":"TestFiltering.Pod","sl":29}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_40":{"methods":[{"sl":62}],"name":"testSimpleInclusionFilter188","pass":true,"statements":[{"sl":63},{"sl":64},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [40], [40], [40], [40], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
