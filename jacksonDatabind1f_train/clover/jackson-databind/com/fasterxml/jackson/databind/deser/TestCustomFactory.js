var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":100,"id":34797,"methods":[],"name":"TestCustomFactory","sl":16},{"el":43,"id":34797,"methods":[{"el":33,"sc":9,"sl":30},{"el":42,"sc":9,"sl":35}],"name":"TestCustomFactory.DummyDeserializer","sl":25},{"el":47,"id":34803,"methods":[],"name":"TestCustomFactory.TestBeans","sl":45},{"el":51,"id":34803,"methods":[],"name":"TestCustomFactory.TestBean","sl":48},{"el":59,"id":34803,"methods":[{"el":58,"sc":9,"sl":55}],"name":"TestCustomFactory.CustomBean","sl":53},{"el":90,"id":34806,"methods":[{"el":89,"sc":9,"sl":63}],"name":"TestCustomFactory.CustomBeanDeserializer","sl":61}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
