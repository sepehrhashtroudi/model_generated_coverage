var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":78,"id":33120,"methods":[{"el":66,"sc":1,"sl":60},{"el":71,"sc":1,"sl":69}],"name":"TestNullSerialization","sl":8},{"el":19,"id":33120,"methods":[{"el":18,"sc":9,"sl":13}],"name":"TestNullSerialization.NullSerializer","sl":11},{"el":23,"id":33122,"methods":[],"name":"TestNullSerialization.Bean1","sl":21},{"el":27,"id":33122,"methods":[],"name":"TestNullSerialization.Bean2","sl":25},{"el":51,"id":33122,"methods":[{"el":32,"sc":9,"sl":32},{"el":35,"sc":9,"sl":33},{"el":40,"sc":9,"sl":37},{"el":50,"sc":9,"sl":42}],"name":"TestNullSerialization.MyNullProvider","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_180":{"methods":[{"sl":13},{"sl":60}],"name":"testOverriddenDefaultNulls298","pass":true,"statements":[{"sl":17},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65}]},"test_221":{"methods":[{"sl":69}],"name":"testSimple503","pass":true,"statements":[{"sl":70}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [180], [], [], [], [180], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [180], [180], [180], [180], [180], [180], [], [], [], [221], [221], [], [], [], [], [], [], [], []]
