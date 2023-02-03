var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":60,"id":37207,"methods":[{"el":48,"sc":1,"sl":46},{"el":53,"sc":1,"sl":51}],"name":"TestJsonSerializeAs","sl":8},{"el":14,"id":37207,"methods":[],"name":"TestJsonSerializeAs.Fooable","sl":12},{"el":22,"id":37207,"methods":[{"el":20,"sc":9,"sl":19},{"el":21,"sc":9,"sl":21}],"name":"TestJsonSerializeAs.FooImpl","sl":18},{"el":28,"id":37211,"methods":[{"el":27,"sc":9,"sl":25}],"name":"TestJsonSerializeAs.Fooables","sl":24},{"el":34,"id":37213,"methods":[{"el":33,"sc":9,"sl":31}],"name":"TestJsonSerializeAs.FooableWrapper","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_230":{"methods":[{"sl":19},{"sl":51}],"name":"testSerializeAsInClass398","pass":true,"statements":[{"sl":20},{"sl":52}]},"test_25":{"methods":[{"sl":19},{"sl":31},{"sl":46}],"name":"testSerializeAsForSimpleProp194","pass":true,"statements":[{"sl":20},{"sl":32},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [230, 25], [230, 25], [], [], [], [], [], [], [], [], [], [], [25], [25], [], [], [], [], [], [], [], [], [], [], [], [], [], [25], [25], [], [], [], [230], [230], [], [], [], [], [], [], [], []]
