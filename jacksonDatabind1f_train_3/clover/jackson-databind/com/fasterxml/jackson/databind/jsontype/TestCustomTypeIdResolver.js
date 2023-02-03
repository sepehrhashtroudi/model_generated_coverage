var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":101,"id":32259,"methods":[{"el":98,"sc":1,"sl":82}],"name":"TestCustomTypeIdResolver","sl":16},{"el":25,"id":32259,"methods":[{"el":23,"sc":9,"sl":23},{"el":24,"sc":9,"sl":24}],"name":"TestCustomTypeIdResolver.CustomBean","sl":20},{"el":72,"id":32262,"methods":[{"el":31,"sc":9,"sl":31},{"el":36,"sc":9,"sl":33},{"el":45,"sc":9,"sl":38},{"el":50,"sc":9,"sl":47},{"el":57,"sc":9,"sl":52},{"el":66,"sc":9,"sl":59},{"el":71,"sc":9,"sl":68}],"name":"TestCustomTypeIdResolver.CustomResolver","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_327":{"methods":[{"sl":23},{"sl":24},{"sl":31},{"sl":38},{"sl":52},{"sl":59},{"sl":82}],"name":"testCustomTypeIdResolver201","pass":true,"statements":[{"sl":24},{"sl":41},{"sl":42},{"sl":54},{"sl":55},{"sl":62},{"sl":63},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":87},{"sl":88},{"sl":89},{"sl":90},{"sl":91},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96},{"sl":97}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [327], [327], [], [], [], [], [], [], [327], [], [], [], [], [], [], [327], [], [], [327], [327], [], [], [], [], [], [], [], [], [], [327], [], [327], [327], [], [], [], [327], [], [], [327], [327], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [327], [], [], [], []]
