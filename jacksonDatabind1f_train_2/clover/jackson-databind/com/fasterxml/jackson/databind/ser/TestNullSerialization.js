var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":78,"id":37259,"methods":[{"el":66,"sc":1,"sl":60},{"el":71,"sc":1,"sl":69}],"name":"TestNullSerialization","sl":8},{"el":19,"id":37259,"methods":[{"el":18,"sc":9,"sl":13}],"name":"TestNullSerialization.NullSerializer","sl":11},{"el":23,"id":37261,"methods":[],"name":"TestNullSerialization.Bean1","sl":21},{"el":27,"id":37261,"methods":[],"name":"TestNullSerialization.Bean2","sl":25},{"el":51,"id":37261,"methods":[{"el":32,"sc":9,"sl":32},{"el":35,"sc":9,"sl":33},{"el":40,"sc":9,"sl":37},{"el":50,"sc":9,"sl":42}],"name":"TestNullSerialization.MyNullProvider","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_400":{"methods":[{"sl":69}],"name":"testSimple501","pass":true,"statements":[{"sl":70}]},"test_431":{"methods":[{"sl":13},{"sl":60}],"name":"testOverriddenDefaultNulls279","pass":true,"statements":[{"sl":17},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [431], [], [], [], [431], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [431], [431], [431], [431], [431], [431], [], [], [], [400], [400], [], [], [], [], [], [], [], []]
