var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":95,"id":33503,"methods":[{"el":68,"sc":1,"sl":57},{"el":77,"sc":1,"sl":71}],"name":"TestSetterlessProperties","sl":15},{"el":29,"id":33503,"methods":[{"el":28,"sc":9,"sl":28}],"name":"TestSetterlessProperties.CollectionBean","sl":24},{"el":36,"id":33505,"methods":[{"el":35,"sc":9,"sl":35}],"name":"TestSetterlessProperties.MapBean","sl":31},{"el":48,"id":33507,"methods":[{"el":43,"sc":9,"sl":43},{"el":47,"sc":9,"sl":45}],"name":"TestSetterlessProperties.Dual","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":57}],"name":"testSimpleSetterlessCollectionFailure367","pass":true,"statements":[{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":66}]},"test_484":{"methods":[{"sl":35},{"sl":71}],"name":"testSimpleSetterlessMapOk382","pass":true,"statements":[{"sl":35},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [484], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [121], [121], [121], [121], [121], [121], [121], [], [], [121], [], [], [], [], [484], [484], [484], [484], [484], [484], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
