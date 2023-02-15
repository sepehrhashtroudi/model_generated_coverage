var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":39627,"methods":[{"el":48,"sc":1,"sl":46}],"name":"TestJsonSerializeAs","sl":8},{"el":14,"id":39627,"methods":[],"name":"TestJsonSerializeAs.Fooable","sl":12},{"el":22,"id":39627,"methods":[{"el":20,"sc":9,"sl":19},{"el":21,"sc":9,"sl":21}],"name":"TestJsonSerializeAs.FooImpl","sl":18},{"el":28,"id":39631,"methods":[{"el":27,"sc":9,"sl":25}],"name":"TestJsonSerializeAs.Fooables","sl":24},{"el":34,"id":39633,"methods":[{"el":33,"sc":9,"sl":31}],"name":"TestJsonSerializeAs.FooableWrapper","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_167":{"methods":[{"sl":19},{"sl":46}],"name":"testSerializeAsInClass398","pass":true,"statements":[{"sl":20},{"sl":47}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [167], [167], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [167], [167], [], [], [], [], [], [], [], []]
